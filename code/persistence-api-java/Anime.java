@Entity
@Table(name = "Anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private int episodes;

    // Getters and setters (omitted for brevity)

    // ToString method (optional for representation)
    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", episodes=" + episodes +
                '}';
    }
}
