package edu.depaul.se359.model;

import edu.depaul.se359.exception.NoPossibleMovesException;

import java.util.List;

/**
 * @author marlon garcia
 */

public final class NavigationSensorsPath {
    private static NavigationSensorsPath ourInstance = new NavigationSensorsPath();

    private NavigationSensorsPath() {
    }

    public NavigationSensorsPath getInstance() {
        return ourInstance;
    }

    private boolean CheckForOpenPath(int path) {

        return path == 2;
    }

    public boolean openPathRight(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getRight();
        return CheckForOpenPath(path);
    }

    public boolean openPathLeft(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getLeft();
        return CheckForOpenPath(path);
    }


    public boolean openPathDown(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getDown();
        return CheckForOpenPath(path);
    }


    public boolean openPathUp(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getUp();
        return CheckForOpenPath(path);
    }


    private boolean CheckForObstacles(int path) {

        return path == 3;


    }


    public boolean obstacleRight(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getRight();
        return CheckForObstacles(path);


    }


    public boolean obstacleLeft(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getLeft();
        return CheckForObstacles(path);


    }


    public boolean obstacleUp(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getUp();
        return CheckForObstacles(path);


    }


    public boolean obstacleDown(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getDown();
        return CheckForObstacles(path);


    }


    private boolean CheckForStairs(int path) {

        return path == 4;

    }


    public boolean stairsRight(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getRight();
        return CheckForStairs(path);


    }

    public boolean stairsLeft(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getLeft();
        return CheckForStairs(path);


    }


    public boolean stairsUp(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getUp();
        return CheckForStairs(path);


    }


    public boolean stairsDown(Cell currentCell) {

        // initialize the path as you don't know  = 1

        int path = 1;
        //get the real path
        path = currentCell.getDown();
        return CheckForStairs(path);


    }


    @SuppressWarnings("null")
    public List<Cell> openCells(Cell currentCell) throws NoPossibleMovesException {
        List<Cell> possibleMoves = null;
        if (!(obstacleUp(currentCell)) && !(stairsUp(currentCell))) {
            possibleMoves.add(currentCell.getUpperCell());
        }
        if (!(obstacleDown(currentCell)) && !(stairsDown(currentCell))) {
            possibleMoves.add(currentCell.getLowerCell());
        }
        if (!(obstacleLeft(currentCell)) && !(stairsLeft(currentCell))) {
            possibleMoves.add(currentCell.getLeftCell());
        }
        if (!(obstacleRight(currentCell)) && !(stairsRight(currentCell))) {
            possibleMoves.add(currentCell.getRightCell());
        }
        if (possibleMoves == null) {
            throw new NoPossibleMovesException("Error: Clean sweep has no possible moves");
        }
        return possibleMoves;

    }


}
