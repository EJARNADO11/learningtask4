public class learningtask {
        static class parent {
            private int a, b;

            public int geta() {
                return a;
            }

            public int getb() {
                return b;
            }

            public void seta(int newa) {
                this.a = newa;
            }

            public void setb(int newb) {
                this.b = newb;
            }

            public parent(int newa, int newb) {
                a = newa;
                b = newb;
            }
            public void print(){
                int total;
                total = geta() + getb();

                System.out.println(total);

            }
        }

        public static class child extends parent{
            private int c;
            public child(int newa, int newb, int newc){
                super(newa,newb);
                c = newc;
            }

            public int getc() {
                return c;
            }
            public void setc(int newc) {
                this.c = newc;
            }

            public void print(){
                int total;
                total = geta() + getb() + c;

                System.out.println(total);

            }

        }
        public static void main(String args[]){
            child c = new child(5, 7,10);
            c.print();
            parent p = new child(1, 2,3);
            p.print();
        }
    }


