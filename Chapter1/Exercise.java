public class Exercise {
    class Table {
        String id;
        int value;
        Table tail;
        Table (String i, int v, Table t) {
            id = i;
            value = v;
            tail = t;
        }

        int lookup(Table t, String key) {
            return -1;
        }
    }

    class IntAndTable {
        int i;
        Table t;
        IntAndTable (int ii, Table tt) {
            i = ii;
            t = tt;
        }
    }

    Table interpStm(Stm s, Table t) {
        return null;
    }

    IntAndTable interpExp (Exp e, Table t) {
        return null;
    }
}
