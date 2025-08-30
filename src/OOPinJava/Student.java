package OOPinJava;


    public  class Student{
        String name;
        int rno;
        double percent;
        private int year;
        final String schoolname="bppp";
        static int noofstudents;
        public Student(){

           //use that to run costruckter and mannual way at the same time
        }

        public Student(String name,int rno,double percent){

            this.name=name;
            this.rno=rno;
            this.percent=percent;
             noofstudents++;

        }


        public int getyear(){

            return year;
        }
        public void setyear(int x){
            year=x;


        }

    }
