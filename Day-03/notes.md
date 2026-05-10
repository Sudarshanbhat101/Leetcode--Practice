# Day 03 Notes

## Problem added

- `7. Reverse Integer`

## Key idea

- Extract each digit using `% 10` and build reversed number by `rev = rev * 10 + digit`.
- Use overflow guard with 32-bit integer limits; return `0` if overflow happens.
