package ITMO.Lab7;

class Plane {
    public Wing wing = new Wing();

    class Wing {
        float weightWing = 0;

        public float getWeightWing() {
            return weightWing;
        }

        public void setWeightWing(float weightWing) {
            this.weightWing = weightWing;
        }

        void ShowWingWeightMethod(float weightWing) {
            System.out.println(weightWing);
        }
    }

}
