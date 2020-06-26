package calculator.business;

import calculator.entities.Language;

public interface Translator {

    public String translate(Language from, Language to, String text);
}
