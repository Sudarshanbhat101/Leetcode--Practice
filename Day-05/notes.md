# Day 05 Notes

## Problems added

- `151. Reverse Words in a String` (Java) — `trim`, split on `\\s+`, reverse word array, `String.join`.
- `75. Sort Colors` (C++) — comparison-based sort (selection-style nested loops); accepts LeetCode constraints; Dutch national flag / counting sort are common faster approaches for this specific problem.

## Tips

- For `151`, splitting on one-or-more whitespace collapses internal extra spaces.
- For `75`, your solution sorts the array so `0,1,2` end up grouped; note time complexity vs optimal \(O(n)\) flag algorithms when you revise.
