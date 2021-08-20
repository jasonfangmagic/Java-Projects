public class overloading {

        private String name;

        public overloading(String name) {
            this.name = name;
        }

        public boolean equals(overloading other) {
            if (this.name == other.name) {
                return true;
            }
            else {
                return false;
            }
        }
}