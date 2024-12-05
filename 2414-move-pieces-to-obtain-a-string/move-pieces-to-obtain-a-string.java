class Solution {
    public boolean canChange(String start, String target) {
        int ind1 = 0, ind2 = 0;

        while (ind1 < start.length() || ind2 < target.length()) {
            while (ind1 < start.length() && start.charAt(ind1) == '_') ind1++;
            while (ind2 < target.length() && target.charAt(ind2) == '_') ind2++;

            if (ind1 == start.length() && ind2 == target.length()) return true;
            if (ind1 == start.length() || ind2 == target.length()) return false;

            if (start.charAt(ind1) != target.charAt(ind2) || 
                (start.charAt(ind1) == 'R' && ind1 > ind2) || 
                (start.charAt(ind1) == 'L' && ind1 < ind2)) return false;

            ind1++;
            ind2++;
        }

        return true;
    }
}