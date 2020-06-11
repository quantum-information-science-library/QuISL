package org.quist.qubits.operators;

import org.junit.jupiter.api.Test;
import org.quist.qubits.Qubit;
import org.quist.qubits.math.ComplexNumber;

import static org.junit.runner.JUnitCore.runClasses;

class PauliZTest {

    public static void main(String[] args) {

        runClasses(PauliZTest.class);

    }

    @Test
    void testOnePauliZ() {

        Qubit qubit = new Qubit(1L);

        ComplexNumber[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);


        qubit.applyPauliZ();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 0);

    }

    @Test
    void testTwoPauliZ() {

        Qubit qubit = new Qubit(2L);

        ComplexNumber[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);


        qubit.applyPauliZ();

        qubit.applyPauliZ();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 0);

    }

}