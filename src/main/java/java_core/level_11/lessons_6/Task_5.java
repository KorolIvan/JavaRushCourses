package java_core.level_11.lessons_6;


/*
 Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.
*/
public class Task_5 {
    public static void main(String[] args) {
    }

    public class Worker {

    }

    public class Clerk extends Worker{

    }

    public class IT extends Worker{

    }

    public class Programmer extends IT{

    }

    public class ProjectManager extends IT{

    }

    public class CTO extends IT{

    }

    public class OfficeManager extends Clerk{

    }

    public class HR extends Clerk{

    }

    public class Cleaner extends Clerk{

    }
}
