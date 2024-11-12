class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> queue = new LinkedList<>();

        for (char c: senate.toCharArray()) {
            queue.offer(c);
        }

        int skip = 0;

        while (Math.abs(skip) <= queue.size()) {
            char c = queue.poll();

            if (c == 'R') {
                skip--;

                if (skip >= 0) {
                    continue;
                }
            } else {
                skip++;
                
                if (skip <= 0) {
                    continue;
                }
            }

            queue.offer(c);
        }

        return skip < 0 ? "Radiant" : "Dire";
    }
}