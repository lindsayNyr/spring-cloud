import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

@Component
public class initBD implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception{

        System.out.println("Création et initialisation de la base de donnée");

        String sqlStatements[] = {
                "drop table cocktail if exists;",
                "create cocktail coktail(id serial, nom varchar(255);",
                "INSERT INTO cocktail (nom, difficulte) VALUES('mojito', 2)"

        };

        Arrays.asList(sqlStatements).stream().forEach(sql ->{
            System.out.println(sql);
            jdbcTemplate.execute(sql);
        });

        System.out.println("Affichagement de touts les coktails ----------------");
        jdbcTemplate.query("select * from cocktail",
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet cocktail, int i) throws SQLException {
                        System.out.println("id" + cocktail.getString("id"));
                        return null;
                    }



                });
    }




}

