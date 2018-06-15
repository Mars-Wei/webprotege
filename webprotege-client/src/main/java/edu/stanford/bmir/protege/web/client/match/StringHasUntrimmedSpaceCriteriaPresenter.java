package edu.stanford.bmir.protege.web.client.match;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import edu.stanford.bmir.protege.web.shared.match.criteria.LiteralComponentCriteria;
import edu.stanford.bmir.protege.web.shared.match.criteria.LiteralCriteria;
import edu.stanford.bmir.protege.web.shared.match.criteria.StringHasUntrimmedSpaceCriteria;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.util.Optional;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 13 Jun 2018
 */
public class StringHasUntrimmedSpaceCriteriaPresenter implements CriteriaPresenter<LiteralCriteria> {

    @Nonnull
    private final BlankCriteriaView view;

    @Inject
    public StringHasUntrimmedSpaceCriteriaPresenter(@Nonnull BlankCriteriaView view) {
        this.view = view;
    }

    @Override
    public void start(@Nonnull AcceptsOneWidget container) {
        container.setWidget(view);
    }

    @Override
    public void stop() {

    }

    @Override
    public Optional<LiteralCriteria> getCriteria() {
        StringHasUntrimmedSpaceCriteria lexicalValueCriteria = StringHasUntrimmedSpaceCriteria.get();
        return Optional.of(LiteralComponentCriteria.lexicalValueMatches(lexicalValueCriteria));
    }
}