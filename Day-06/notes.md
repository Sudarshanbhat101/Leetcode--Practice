# Day 06 Notes

## Problem added

- `205. Isomorphic Strings` (Java) — Two arrays (or maps) track the last index where each character was paired; `i + 1` avoids confusion with default `0`. Mismatch means two chars would break one-to-one mapping.

## Complexity

- Time: O(n) where n = length of strings (single pass).
- Space: O(1) — fixed 256 slots per array (ASCII-sized; same idea extends for Unicode with larger maps if needed).
