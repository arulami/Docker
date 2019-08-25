package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchFor extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(SearchForm.SEARCH_FIELD).clear();
        $(SearchForm.SEARCH_FIELD).type(term);
        $(SearchForm.SEARCH_BUTTON).click();
    }
}
