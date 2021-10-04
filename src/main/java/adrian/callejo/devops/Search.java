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

    public Stream<String> findUserFamilyNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getFamilyName);
    }

    public Optional<Fraction> findHighestFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .max(Fraction::compareTo);
    }

    public Optional<Fraction> findFractionSubtractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getName().equals(name))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::substract);
    }

}
