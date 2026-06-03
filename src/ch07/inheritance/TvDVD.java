package ch07.inheritance;

class TV {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class DVD {
    boolean power;
    int counter = 0;

    void power() { power = !power; }
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}

class TvDVD extends TV{
    DVD dvd = new DVD();

    void play() {
        dvd.play();
    }

    void stop() {
        dvd.stop();
    }

    void rew() {
        dvd.rew();
    }

    void ff() {
        dvd.ff();
    }
}
