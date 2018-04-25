package java_core.level_18.lesson_8.task_5;

import java.util.List;

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface{
        private ATableInterface aTableInterface;
        private String headerText;

        public TableInterfaceWrapper(ATableInterface aTableInterface) {
            this.aTableInterface = aTableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            aTableInterface.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return aTableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            aTableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
