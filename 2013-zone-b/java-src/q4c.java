class q4c {
    private Object[] array;
    public Arr(Object[] array) {
        this.array = array;
    }

    public String toString() {
        String result;
        for (int i = 0; i < array.length; i++) {
            result += array[i] + ";";
        }
        return result;
    }
}
