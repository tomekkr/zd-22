import java.util.Objects;

class Input {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Input input = (Input) o;
        return Objects.equals(string, input.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

}
