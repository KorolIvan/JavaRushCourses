package java_multithreading.level_4.lesson_4.task_1;

import java.math.BigDecimal;


/**
 * @author Ivan Korol on 7/27/2018
 */
public class Solution {
    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    public static void main(String[] args) {

    }

    public class Apt3Bedroom extends Building.Apartments{

        public Apt3Bedroom(Building building) {
            building.super();
        }
    }

    public class BigHall extends Building.Hall {

        public BigHall(Building building, BigDecimal square) {
            building.super(square);
        }
    }
}
