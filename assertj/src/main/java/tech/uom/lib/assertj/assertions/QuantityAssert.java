package tech.uom.lib.assertj.assertions;

import javax.measure.Quantity;

/**
 * {@link Quantity} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractQuantityAssert} instead.
 */
@javax.annotation.Generated(value = "assertj-assertions-generator")
public class QuantityAssert extends AbstractQuantityAssert<QuantityAssert, Quantity> {

    /**
     * Creates a new <code>{@link QuantityAssert}</code> to make assertions on actual Quantity.
     *
     * @param actual the Quantity we want to make assertions on.
     */
    public QuantityAssert(Quantity actual) {
        super(actual, QuantityAssert.class);
    }

    /**
     * An entry point for QuantityAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myQuantity)</code> and get specific assertion with code completion.
     *
     * @param actual the Quantity we want to make assertions on.
     * @return a new <code>{@link QuantityAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static QuantityAssert assertThat(Quantity actual) {
        return new QuantityAssert(actual);
    }
}
