package org.quisl.framework.java.units.qubits.operators.single.pauli;

import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.units.qubits.math.linear.algebra.pauli.PauliMatrix;
import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.operators.single.SingleQuantumOperator;

public class PauliY extends SingleQuantumOperator {

    private ComplexNumber[][] pauliYMatrix;

    public PauliY(Qubit qubit) throws Exception {

        super(qubit, PauliMatrix.getPauliYMatrix());

        this.setup();

    }

    @Override
    public String getName() {
        return "PauliY";
    }

    @Override
    public String getInfo() {
        return "Rotates 90º around the Y Axis of the Bloch Sphere;";
    }

    @Override
    public void setup() throws Exception {

        if (this.getNumQubits() != this.getQubits().length) {

            if (this.getNumQubits() != 1) {

                throw new Exception();

            }

        }

        this.pauliYMatrix = this.getQuantumOperatorMatrix();

    }

    public ComplexNumber[][] getPauliYMatrix() {
        return this.pauliYMatrix;
    }

}
