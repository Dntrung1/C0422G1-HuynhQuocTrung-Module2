package case_study.model;

import java.util.ArrayList;

public class Producer {
    private int plu;
    private String producerName;
    private String nation;

    public Producer() {
    }

    public Producer(int plu, String producerName, String nation) {
        this.plu = plu;
        this.producerName = producerName;
        this.nation = nation;
    }

    public int getPlu() {
        return plu;
    }

    public void setPlu(int plu) {
        this.plu = plu;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "plu=" + plu +
                ", producerName='" + producerName + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
