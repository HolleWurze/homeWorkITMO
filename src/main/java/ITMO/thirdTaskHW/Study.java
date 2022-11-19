package ITMO.thirdTaskHW;

public class Study {
    public static void main(String[] args) {
        study study = new study("Изучать Java - это просто!");
        System.out.println(study.printCourse());

    }

    static class study {
        public study(String course) {
            this.course = course;
        }

        private String course;

        public String printCourse() {
            return this.course;

        }
    }
}
