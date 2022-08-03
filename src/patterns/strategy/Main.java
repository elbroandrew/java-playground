package patterns.strategy;

public class Main {

    public static void main(String[] args) {
        Context ctxA = new Context(new StrategyA());
        ctxA.useStrategy();
        Context ctxB = new Context(new StrategyB());
        ctxB.useStrategy();

    }

    static class Context{
        private Strategy strategy;

        public Context(Strategy strategy) {
            this.strategy = strategy;
        }

        void useStrategy(){
            this.strategy.use();
        }
    }

    interface Strategy{
        void use();
    }

    static class StrategyA implements Strategy{
        @Override
        public void use() {
            System.out.println("using strategy A");
        }
    }

    static class StrategyB implements Strategy{
        @Override
        public void use() {
            System.out.println("using strategy B");
        }
    }


}
