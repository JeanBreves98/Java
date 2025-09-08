package dev.lpa.sealed;

public sealed abstract class SpecialAbstractClass permits FinalKid, NonSealedKid, SpecialAbstractClass.Kid, SealedKid {

    final class Kid extends SpecialAbstractClass {

    }
}
