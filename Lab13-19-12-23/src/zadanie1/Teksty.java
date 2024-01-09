package zadanie1;

public class Teksty {
    private final String[] teksty;

    public Teksty(String[] teksty) {
        this.teksty = teksty;
    }
    public StringsIterator getIterator(){
        return new TekstyIterator();
    }

    private class TekstyIterator implements StringsIterator{
        private int pointer;

        public TekstyIterator() {
            this.pointer = 0;
        }

        @Override
        public boolean hasNext() {
            return pointer<Teksty.this.teksty.length;
        }

        @Override
        public String next() {
            return Teksty.this.teksty[pointer++];
        }
    }
}
