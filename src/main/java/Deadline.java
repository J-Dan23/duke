import java.time.LocalDate;

public class Deadline extends Task {
    public Deadline(String description, LocalDate date) {
        this.description = description;
        this.type = "D";
        this.date = date;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return String.format(
                "[%s][%s] %s (%s)",
                this.getType(),
                this.getStatusIcon(),
                this.getDescription(),
                this.formatDate(getDate()));
    }
}
