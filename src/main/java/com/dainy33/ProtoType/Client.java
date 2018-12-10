package com.dainy33.ProtoType;

import org.junit.Test;

public class Client {

    @Test
    public void deepCopy_2() throws Exception {
        Platelet platelet1 = new Platelet(1, "Platelet1");
        Cell cell = new Cell(1, "Cell", platelet1);
        Cell cloneCell = (Cell) cell.deepClone();
        Platelet platelet2 = new Platelet(2, "Platelet2");
        cloneCell.getPlatelet().setLife(2);
        cloneCell.getPlatelet().setType("Platelet2");
        Platelet platelettemp = cell.getPlatelet();
        System.out.println(platelettemp.getLife() + " " + " " + platelettemp.getType());
    }

    @Test
    public void deepCopy_1() throws Exception {
        Platelet platelet1 = new Platelet(1, "Platelet1");
        Cell cell = new Cell(1, "Cell", platelet1);
        Cell cloneCell = (Cell) cell.clone();
        Platelet platelet2 = new Platelet(2, "Platelet2");
        cloneCell.getPlatelet().setLife(2);
        cloneCell.getPlatelet().setType("Platelet2");
        Platelet platelettemp = cell.getPlatelet();
        System.out.println(platelettemp.getLife() + " " + " " + platelettemp.getType());
    }

}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 16:52
 **/
