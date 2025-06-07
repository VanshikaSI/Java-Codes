class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread C: " + i);
        }
    }
}

class Multiple {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
