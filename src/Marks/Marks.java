package Marks;

public  class Marks {
    public Subject teluguSubject;
    public Subject hindiSubject;
    public Subject englishSubject;
    public Subject mathsSubject;

    @Override
    public String toString() {
        return "Marks{" +
                "teluguSubject=" + teluguSubject +
                ", hindiSubject=" + hindiSubject +
                ", englishSubject=" + englishSubject +
                ", mathsSubject=" + mathsSubject +
                ", scienceSubject=" + scienceSubject +
                ", socialSubject=" + socialSubject +
                '}';
    }

    public Subject scienceSubject;
    public Subject socialSubject;
}
