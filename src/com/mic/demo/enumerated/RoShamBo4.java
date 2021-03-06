//: com.mic.demo.enumerated/RoShamBo4.java
package com.mic.demo.enumerated;

public enum RoShamBo4 implements Competitor<RoShamBo4> {
    ROCK {
        public Outcome compete(RoShamBo4 opponent) {
            return compete(SCISSORS, opponent);
        }
    },
    SCISSORS {
        public Outcome compete(RoShamBo4 opponent) {
            return compete(PAPER, opponent);
        }
    },
    PAPER {
        public Outcome compete(RoShamBo4 opponent) {
            return compete(ROCK, opponent);
        }
    };

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo4.class, 20);
    }

    Outcome compete(RoShamBo4 loser, RoShamBo4 opponent) {
        return ((opponent == this) ? Outcome.DRAW
                : ((opponent == loser) ? Outcome.WIN
                : Outcome.LOSE));
    }
} /* Same output as RoShamBo2.java *///:~
