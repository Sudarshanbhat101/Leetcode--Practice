# Day 11 Notes

## Problem added

- `605. Can Place Flowers` (Java) — Greedy single pass: plant at empty slot `i` only if left and right neighbors are empty (or edge treated as empty). Mark planted slots as `1` and count; early return when `count >= n`.

## Complexity

- Time: O(n)
- Space: O(1) extra (modifies input in place)
