# Exercise 7: Table Styling

## Scenario
The events admin table needs a cleaner look.

## Objective
Format tables using CSS.

## Tasks Completed

### 1. Styled Table, TH, and TD

```css
table,
th,
td {
    border: 1px solid black;
}
```

### 2. Added Padding

```css
th,
td {
    padding: 12px;
}
```

### 3. Applied Background Colors

```css
th {
    background-color: #007BFF;
    color: white;
}
```

### 4. Added Zebra Striping

```css
tr:nth-child(even) {
    background-color: #e6f2ff;
}
```

### 5. Used Border Collapse

```css
table {
    border-collapse: collapse;
}
```

### 6. Center Aligned Text

```css
table {
    text-align: center;
}
```

## Concepts Practiced

- Table Styling
- Borders
- Padding
- Background Colors
- nth-child()
- Zebra Striping
- border-collapse
- text-align

## Files

- index.html
- styles.css

## Output

(Add screenshot here)