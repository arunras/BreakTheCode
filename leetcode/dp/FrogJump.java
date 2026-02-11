/*=== 403. Frog Jump ===*/

class FrogJump {
  int[] stones;

  Set<Integer> set;
  Map<String, Integer> map;
  int target;
  
  /*== TOP DOWN ==*/
  public boolean canCross(int[] stones) {
    this.stones = stones;
    int n = stones.length;
    this.target = stones[n - 1];

    // Quick look up for any stone
    set = new HashSet<>();
    for (int stone : stones) set.add(stone);

    // Cache: map "stone-k" -> result
    map = new HashMap<>();

    // Initialize Condition: First jump MUST be 1 unit from 0
    if (stone[1] != 1) return false;

    return solve(1, 1);
  }

  publice boolean solve(int stone, int k) {
    // 1. Base Case: Reached the last stone
    if (stone == target) return true;
  
    // 2. Cache Check: return if available
    int state = stone + "-" + k;
    if (map.containsKey(state)) return map.get(state);

    // 3. Try 3 possible next jump: {k - 1, k, k + 1}
    for (int nextK = k - 1; nextK <= k + 1; nextK++) {
      if (nextK > 0) {
        int nextStone = stone + nextK;
        if (set.contains(nextStone)) {
          boolean isReachable = solve(nextStone, nextK);
          if (isReachable) {
            map.put(state, true);
            return true;
          }
        }
      }
    }
    
    map.put(state, false);
    return false;
  }
  
}
