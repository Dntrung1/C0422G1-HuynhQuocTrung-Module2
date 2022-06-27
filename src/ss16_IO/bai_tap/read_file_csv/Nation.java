package ss16_IO.bai_tap.read_file_csv;

public class Nation {
    private int id;
    private String code;
    private String name;

    public Nation() {
    }

    public Nation(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return'{' +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
