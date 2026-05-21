# beagle-lab

Experiment archive for [beagle](https://github.com/tompassarelli/beagle) — the multi-target typed authoring IR.

Each directory is a self-contained experiment with tasks, results, and methodology. Experiments are the empirical evidence behind beagle's design decisions.

## Experiments

| ID | Name | What it tested |
|----|------|----------------|
| E0 | Syntax variants | s-expression surface syntax options |
| E1 | Head-to-head | Beagle vs Clojure on identical tasks |
| E3 | Bug detection | Type-checker effectiveness on seeded bugs |
| E4 | Refactoring | Typed refactoring vs untyped |
| E5 | Event pipeline | Domain modeling at scale |
| E6 | Trading | Financial domain complexity |
| E8 | Scaled | Large-codebase behavior |
| E9 | Repair toolchain | Automated repair ROI |
| E10 | Workflow compression | Wall-time reduction techniques |
| E11 | Model tier | LLM model size vs type-system value |
| E16 | Workflow scheduler | Type-checker integration (P1/P2/P3 profiles) |
| E17 | Typed codegen | Code generation with type constraints |
| E18 | Macro compression | Proc macro compression ratios |
| E19 | Agent macro authoring | Can agents write proc macros? |
| E20 | Macro CNF | Query tools + macro expansion |
| E21 | Macro composition | Composing multiple macros |
| E22 | Cross-target macros | Same macro across all 6 targets |

## Key findings

- **P2 checker profile** is the sweet spot (E16): exhaustive match + narrowing. P3 effects add no value; P1 false positives hurt (3.4x slower).
- **Types help agents build features**, not find bugs (E16). Tests win for correctness; types win for reasoning speed.
- **Proc macros compress 2-3x** at realistic scale (E18). Template macros can't express the test patterns.
- **Agents can write proc macros** when given docs (E19). Without docs, they default to runtime dispatch.
- **Best config: 287s avg** wall time (E13), per-bug faster than Python+mypy.

## Provenance

Extracted from the `experiments/` directory of the beagle repo at commit `971d21d`.
