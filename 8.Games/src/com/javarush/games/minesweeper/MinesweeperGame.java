package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped = false;
    private int countClosedTiles = SIDE * SIDE;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x, y, "");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
//        isGameStopped = false;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject cell = gameField[y][x];
                if (!cell.isMine) {
                    List<GameObject> Items = getNeighbors(cell);
                    int count = 0;
                    for (GameObject object : Items) {
                        if (object.isMine) {
                            count++;
                        }
                    }
                    cell.countMineNeighbors = count;
                }
            }
        }
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void openTile(int x, int y) {
        if (isGameStopped) {
            return;
        }
        GameObject cell = gameField[y][x];
        if (cell.isOpen || cell.isFlag) {
            return;
        }
        boolean flag = gameField[y][x].isMine;
        if (flag) {
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else if (cell.countMineNeighbors != 0) {
            setCellNumber(x, y, cell.countMineNeighbors);
            setCellColor(x, y, Color.GREEN);
            cell.isOpen = true;
            countClosedTiles--;
            score = score + 5;
        } else {
            cell.isOpen = true;
            countClosedTiles--;
            score = score + 5;
            setCellColor(x, y, Color.GREEN);
            setCellValue(x, y, "");
            List<GameObject> neighbors = getNeighbors(cell);
            for (GameObject item : neighbors) {
                openTile(item.x, item.y);
            }
        }
        if (!flag) {
            setScore(score);
        }
        if (!flag & (countClosedTiles == countMinesOnField)) {
            win();
        }
    }

    private void markTile(int x, int y) {
        if (isGameStopped) {
            return;
        }
        GameObject cell = gameField[y][x];
        if (cell.isOpen) {
            return;
        }
        if (!cell.isFlag) {
            if (countFlags > 0) {
                cell.isFlag = true;
                countFlags--;
                setCellValue(x, y, FLAG);
                setCellColor(x, y, Color.YELLOW);
            }
        } else {
            cell.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.ORANGE);
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "Игра окончена", Color.VIOLET, 50);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.BLUE, "Поздравляем с ПОБЕДОЙ!", Color.CYAN, 50);
    }

    private void restart() {
    isGameStopped = false;
    score = 0;
    setScore(score);
    countClosedTiles = SIDE * SIDE;
    countMinesOnField = 0;
    createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (!isGameStopped) {
            super.onMouseLeftClick(x, y);
            openTile(x, y);
        } else {
            restart();
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        super.onMouseRightClick(x, y);
        markTile(x, y);
    }
}