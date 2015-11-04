package org.dimigo.thread;

class Runner2 implements Runnable {
    private String name;

    public Runner2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " 출발");
            for (int dist = 100; dist >= 0; dist -= 10) {
                System.out.printf("%s %d 미터\n", name, dist);
                Thread.sleep(1000);
            }
            System.out.println(name + " 골인");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}