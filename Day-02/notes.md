# Day 02 Notes

## Problems added

- `26. Remove Duplicates from Sorted Array` — Two pointers: keep unique prefix, compact in-place, return new length `k`.
- `283. Move Zeroes` — Move non-zero values to the front in one pass; fill the rest with zeros.

## Tips

- Sorted array dedup: compare `nums[i]` with `nums[j]`; only advance `i` when a new value appears.
- Zero move: single pass with a write index avoids extra array when order of non-zeros is preserved.
