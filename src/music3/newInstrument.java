package music3;

public class newInstrument extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("newIns.play()"+n);
    }
}
