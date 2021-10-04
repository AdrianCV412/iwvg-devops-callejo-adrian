package adrian.callejo.devops;

import java.util.Optional;
import java.util.stream.Stream;

public class Search {

    public Stream<String> findUserNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getName);
    }

    public Optional<Fraction> findHighestFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .max(Fraction::compareTo);
    }

}
