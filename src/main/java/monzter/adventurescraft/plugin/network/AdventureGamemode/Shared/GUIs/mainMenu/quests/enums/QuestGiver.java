package monzter.adventurescraft.plugin.network.AdventureGamemode.Shared.GUIs.mainMenu.quests.enums;

public enum QuestGiver {
    TUTOR(QuestArea.TUTORIAL,  "ewogICJ0aW1lc3RhbXAiIDogMTYyOTkyOTQwMTgyNSwKICAicHJvZmlsZUlkIiA6ICIwNWJhN2FmOGY0M2M0NGFjYWJkZjkzZjVmMTk2Njg3NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJESkdyb3VuZDAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGMzN2UwNDUzMzE5MThhZTFjODcxNTlkYmRlYThiNzI3ZmE4ZWQ4NDNlYjIzZDhkMDg0Y2UwNjdiNjlmNWM5MyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"),

    FLINT(QuestArea.TOWN,  "eyJ0aW1lc3RhbXAiOjE1NDY3MTk2MDU0OTUsInByb2ZpbGVJZCI6ImE5MGI4MmIwNzE4NTQ0ZjU5YmE1MTZkMGY2Nzk2NDkwIiwicHJvZmlsZU5hbWUiOiJJbUZhdFRCSCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA4Y2JiNWVjMzc3M2M4NjRjMjNiZmVmMWUzNDJmZTM2MTNkMjZmMTVhYTA0MjFlYTQ3YTg0NTczMDllNGEzMyJ9fX0="),
    WIZARD(QuestArea.TOWN,  "eyJ0aW1lc3RhbXAiOjE1NTQyMjkyMzIzMDksInByb2ZpbGVJZCI6IjkxZmUxOTY4N2M5MDQ2NTZhYTFmYzA1OTg2ZGQzZmU3IiwicHJvZmlsZU5hbWUiOiJoaGphYnJpcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzZiNzk1MzZkZjA4ZTI4ODQxMjI0OGIxNTNkZDVlNDMwYmE1YTc4ZTE0YWNkZTc5MDU1NDMzNjNkYzg4MGRhOCJ9fX0="),
    WARLOCK(QuestArea.TOWN,  "ewogICJ0aW1lc3RhbXAiIDogMTYwNDYyOTkwMjY4MSwKICAicHJvZmlsZUlkIiA6ICI5ZDEzZjcyMTcxM2E0N2U0OTAwZTMyZGVkNjBjNDY3MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUYWxvZGFvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UzNWM5ZWE0M2IxYTBhMDNlMmNiOWFkYTBjY2RiMTQ1MzBmMDc3MTE2Y2ZmZjhjNzYxZmIxYzY4YTk2OGU5ZjAiCiAgICB9CiAgfQp9"),

    CIRL(QuestArea.GRAVEYARD, "eyJ0aW1lc3RhbXAiOjE1ODQ4OTg1ODgzMDAsInByb2ZpbGVJZCI6Ijc3MjdkMzU2NjlmOTQxNTE4MDIzZDYyYzY4MTc1OTE4IiwicHJvZmlsZU5hbWUiOiJsaWJyYXJ5ZnJlYWsiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYzODIyZDBiNGFlMjBhOGRjMzA3NWRiYTg5YjI2YjU3NDU1ZDlmYWYwYTEwNWNlMzRmYjViYmQzZGJiZmY3M2YifX19"),
    NAVID(QuestArea.COURTYARD, "eyJ0aW1lc3RhbXAiOjE1ODY0Nzc0MjQ4MTAsInByb2ZpbGVJZCI6IjRkNzA0ODZmNTA5MjRkMzM4NmJiZmM5YzEyYmFiNGFlIiwicHJvZmlsZU5hbWUiOiJzaXJGYWJpb3pzY2hlIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZGQzMWM5ZjFmMWYxZGE5ZGE3ZjA4Y2JmMGE5MDNhMWJmMGE0NzhkNWM0ZmM0NGQ0MjNhMWZiZGJlNDkxZGU5In19fQ=="),
    KLAUS(QuestArea.CASTLE, "ewogICJ0aW1lc3RhbXAiIDogMTU4OTg2MDA0NTg5MSwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGbGF3Q3JhQm90MDEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGQ4ZDI4ZTgxNmYyMDM0MjA5MjU4MTMzYWI2ZTBhZmUwZTU0YjQ3MTlmMzhmZjMyZWZkYTJhMzRmZDM2MWM1MSIKICAgIH0KICB9Cn0="),

    JENNY(QuestArea.FOREST, "eyJ0aW1lc3RhbXAiOjE1Nzk0OTEzODE2NDYsInByb2ZpbGVJZCI6IjgyYzYwNmM1YzY1MjRiNzk4YjkxYTEyZDNhNjE2OTc3IiwicHJvZmlsZU5hbWUiOiJOb3ROb3RvcmlvdXNOZW1vIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMzZlMmU4MDgzNDNiNzY0NGZlZjNjOTY2ZTY2NzBiZmIxN2U1NmVjZjU4MGNmNTIxMjgxNWJkMzhjNWU5NWJmIn19fQ=="),
    BEAR(QuestArea.FOREST, "eyJ0aW1lc3RhbXAiOjE1ODY4MDY0NjU3OTIsInByb2ZpbGVJZCI6ImU3OTNiMmNhN2EyZjQxMjZhMDk4MDkyZDdjOTk0MTdiIiwicHJvZmlsZU5hbWUiOiJUaGVfSG9zdGVyX01hbiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmYwNTAwMzhmNDFlNzg2MzkwY2VlNzc5YWJiNzc1YTMyZWFhNmUwY2NjNDI0MTBmNTYwNjg3NGIyMzIxMWI5MCJ9fX0="),
    CAT_LADY(QuestArea.FOREST, "ewogICJ0aW1lc3RhbXAiIDogMTYxMjg0NTI2ODU1MSwKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOThiMDI4N2MxMTQ3MWU0NjJiZjQxNjkwMTQ3ZTNlZTdhMGRmMzE0ZjAwMGM1NDY5ZTc3MzA3ZWZmN2MwOWUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="),
    JACK(QuestArea.FOREST, "ewogICJ0aW1lc3RhbXAiIDogMTU5MjMzOTIyODgzNCwKICAicHJvZmlsZUlkIiA6ICIyZGM3N2FlNzk0NjM0ODAyOTQyODBjODQyMjc0YjU2NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzYWR5MDYxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZWVkYTQxZGJlM2JlYWMzMTAzN2FkYTQ1YmU5YThjMDlhZTkyYTA5MmJjMTQ1ODJhMDAwOGNiZTBkYzIzN2I4IgogICAgfQogIH0KfQ=="),

    GEM_SMITH(QuestArea.CAVERN, "ewogICJ0aW1lc3RhbXAiIDogMTU5NTYyODg5OTUwMiwKICAicHJvZmlsZUlkIiA6ICJkODAwZDI4MDlmNTE0ZjkxODk4YTU4MWYzODE0Yzc5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVCTFJ4eCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZDQyODI4ZWVmMDU2YTM0MWRlMGNhNGNlYjg2ZTNmZWFiN2VlN2UzZmM1ODk1YmNjYTY3ZmE0ZjQ0NGI4ZGIyIgogICAgfQogIH0KfQ=="),
    LARRY(QuestArea.CAVERN, "ewogICJ0aW1lc3RhbXAiIDogMTYzMTE4MzI4NzQxNSwKICAicHJvZmlsZUlkIiA6ICJiYjdjY2E3MTA0MzQ0NDEyOGQzMDg5ZTEzYmRmYWI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXVyZW5jaW8zMDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWVjNDA2NWJmMTQ5Nzg0N2JhODY4ODUyYTk0OTk0YmQ5MjEwZjE2ZjJlMGYzNTE3ZDNhYTM2YjgyZmQzNzgyNSIKICAgIH0KICB9Cn0="),
    DUNE(QuestArea.CAVERN, "ewogICJ0aW1lc3RhbXAiIDogMTYwMTMxNTU1OTkyNywKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YwMTNmOWNlNmEzMTc5MTFmMjE5YmRhNWM1NjdjZDVjZTMzNDJmMTQxYWQ2Y2YzMDU1YjNhMmVmMWVmMGNkYSIKICAgIH0KICB9Cn0="),
    BART(QuestArea.CAVERN, "ewogICJ0aW1lc3RhbXAiIDogMTYxMTE3NzY4MjQyMiwKICAicHJvZmlsZUlkIiA6ICI3ZGEyYWIzYTkzY2E0OGVlODMwNDhhZmMzYjgwZTY4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHb2xkYXBmZWwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTg5YTk5NzY5NWRmNGRiYmMzNzZkMTI2MjIwNjljMmQ3NjcyNTlmM2JkMGVhM2EwMzI3NDEzZGVhNjQ1MDlhNiIKICAgIH0KICB9Cn0="),
    LANE(QuestArea.CAVERN, "ewogICJ0aW1lc3RhbXAiIDogMTYxMTA1MjE5NTE4NSwKICAicHJvZmlsZUlkIiA6ICI5ZDIyZGRhOTVmZGI0MjFmOGZhNjAzNTI1YThkZmE4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYWZlRHJpZnQ0OCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hYjA4NWNmMjhlZTZmZmM0MjE5NTM2YzYzNWY3ZDEzODJhYzVkNjMzMzdjMzRmOWI5OWQ1YWFhYzRhOGI3NzAyIgogICAgfQogIH0KfQ=="),
    JAKE(QuestArea.CAVERN, "ewogICJ0aW1lc3RhbXAiIDogMTYzMTE4MzEzODgxMSwKICAicHJvZmlsZUlkIiA6ICI5MGQ1NDY0OGEzNWE0YmExYTI2Yjg1YTg4NTU4OGJlOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFdW4wbWlhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ3MzRhMmRjNTExZmJkYzA1OWM3M2FjNjk1NjQwNWU1OTFkMzRmYzA4MmRhMWY5ZjgzN2RhMzVkNjgzYjNlYjIiCiAgICB9CiAgfQp9"),

    ANJU(QuestArea.FARM, "ewogICJ0aW1lc3RhbXAiIDogMTYxMjkzOTE1OTc4NiwKICAicHJvZmlsZUlkIiA6ICI0ZWQ4MjMzNzFhMmU0YmI3YTVlYWJmY2ZmZGE4NDk1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaXJlYnlyZDg4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M4NTY4NzZiYjI1Nzc5NjEzZTkxNzJlNjQxZTdiYmM1MDE3YzgxZjZlNWQ1YTg3NWE1YTgyZDYwYmUwNDk2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="),
    INGO(QuestArea.FARM, "ewogICJ0aW1lc3RhbXAiIDogMTU4OTU4NzA0NDU0NiwKICAicHJvZmlsZUlkIiA6ICJkNjBmMzQ3MzZhMTI0N2EyOWI4MmNjNzE1YjAwNDhkYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCSl9EYW5pZWwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGI1NjZlMjViZDgzOTVmMWU4OTk3OWZkYTI4MzljYzgyOTk3ZDdmYjU2NzhmYzQ5ZTNjNDY5YWU5NWYxYjRiYiIKICAgIH0KICB9Cn0="),
    MANDY(QuestArea.FARM, "eyJ0aW1lc3RhbXAiOjE1MjU2NTc3MzkyODQsInByb2ZpbGVJZCI6IjQzYTgzNzNkNjQyOTQ1MTBhOWFhYjMwZjViM2NlYmIzIiwicHJvZmlsZU5hbWUiOiJTa3VsbENsaWVudFNraW42Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82ZGY1MzgzNzdkNmY3ZGY4MjkyMzhiZDVkMDEzNzY5ODExNjA2ZTE0NDVlODNjYzYyMTgyZjYyOTY0MTExYjU2IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0="),
    BILLY(QuestArea.FARM, "eyJ0aW1lc3RhbXAiOjE1NTk3NDI4NzgzNzcsInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y1ZTMzNDVmZDFlZGQ0NDc3NGRjMjg2NDY5ZGRmZWY3N2ZlZTQ2MmJlN2M4NTAzOWFiMjM2NmY3ZTExNDkyMTQifX19"),

    MAEL(QuestArea.VALLEY, "eyJ0aW1lc3RhbXAiOjE1MzQwNjgxMTIzNzMsInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2RlZmI3MWUzZjk2ZWNjMGIyNGQzNzM5MTg4NWIzYWFmZWIzOTdiYTY2NWM2NzBhMzhmNzNjYmUzN2E3ODg3NCJ9fX0="),

    BOWYER(QuestArea.ESTATE, "eyJ0aW1lc3RhbXAiOjE1NzgwNjU0MDg0MzYsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGI1OTRlZDBlNmE0Nzc3M2NjNDVmZTQ2Y2QzY2IwNTU3ZWNmNmY2M2ViYTY2NGY5ZDgyMGNiNDk5MmM0MTFiMCJ9fX0="),
    DON(QuestArea.ESTATE, "ewogICJ0aW1lc3RhbXAiIDogMTU5MzcyODc5NTU3OSwKICAicHJvZmlsZUlkIiA6ICIyYzEwNjRmY2Q5MTc0MjgyODRlM2JmN2ZhYTdlM2UxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYWVtZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mN2Q1OWI3NWM4YjlmNTg1MWJiMGQ3ZGI0ZGM3MWYxYzZkOTYxZGI0OTU3OTQ4YjdiMzgwMmY1NzEyZWI4N2JmIgogICAgfQogIH0KfQ=="),
    SANDRAH(QuestArea.ESTATE, "ewogICJ0aW1lc3RhbXAiIDogMTU5MzcyODI3OTU2MywKICAicHJvZmlsZUlkIiA6ICI4YzUzN2M3YWEzYjI0NWFmOGQ0ODY2YmIxZjhjMGU5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJCb0F0TmVlR2EiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTMzMGZkMGM1ZWI3NGUxZGUwZTViNjlhMDIxODE1OTdjYzdiMGNhZGE3OTU2NjYwNDI2MWQwMjZhMDYyOTI5YSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"),

    ZRAS(QuestArea.GOBLIN_TOWN, "ewogICJ0aW1lc3RhbXAiIDogMTU4OTE5OTg4OTQxMSwKICAicHJvZmlsZUlkIiA6ICIxOTI1MjFiNGVmZGI0MjVjODkzMWYwMmE4NDk2ZTExYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJpYWxpemFibGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzFkODcwYmFkNjIzZWRhYTc5MWZkZTgxYTMxYTYxY2U0N2UxZTUwNjI5NDg5Mjg4MDU4MDg4YTg4OTZjN2IiCiAgICB9CiAgfQp9"),

    HAZEL(QuestArea.SPIRIT_GROUNDS, "eyJ0aW1lc3RhbXAiOjE1NzY5OTQ1NTE3MjUsInByb2ZpbGVJZCI6Ijc1MTQ0NDgxOTFlNjQ1NDY4Yzk3MzlhNmUzOTU3YmViIiwicHJvZmlsZU5hbWUiOiJUaGFua3NNb2phbmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEwODUwNmI1NTdjODIwYTNhYTVjMTYyY2VjNzFmYTU4NmE3ZWVjZjExZDAyOTBhNTllNDFjNTQwYWVmOTMyZDcifX19"),

    DAMON(QuestArea.HELL, "eyJ0aW1lc3RhbXAiOjE1MzIzNjYwMzUxMzYsInByb2ZpbGVJZCI6ImMxZWQ5N2Q0ZDE2NzQyYzI5OGI1ODFiZmRiODhhMjFmIiwicHJvZmlsZU5hbWUiOiJ5b2xvX21hdGlzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iMDYyMTU4ODM0NTUwMWNjMzY5MWJmOTI2MGFjYzc2ZWQ5ZTcxZTIxN2Q5M2IxY2NhYTdjYzg0Y2FlMGNiYWYwIn19fQ=="),
    DIABLO(QuestArea.HELL, "eyJ0aW1lc3RhbXAiOjE1Njg2OTkzMzEzMzQsInByb2ZpbGVJZCI6IjNhYTM2M2QwNjY0ZjRlYTBhNjdhZTk0MGYxMzgxMzFlIiwicHJvZmlsZU5hbWUiOiJFbmRlcl9hc3Nhc3NpbjYiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MzZDQwOGI3YzRhZWRiYzY4MjQ0NTI1NTdiYmRiMjMxY2RhMzE4YTI0OTFjODc2NzA4YTE5MmYwYWY1MjhlNTcifX19"),

    KHAZIX(QuestArea.VOID, "ewogICJ0aW1lc3RhbXAiIDogMTYwNjM4ODc2OTUyMiwKICAicHJvZmlsZUlkIiA6ICI0ZWQ4MjMzNzFhMmU0YmI3YTVlYWJmY2ZmZGE4NDk1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaXJlYnlyZDg4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NkYmQ2MzI5YWFkMGU3NWFkODQwOWNlMGY0MTkwOGI5NDY4NjJiMzk4MTQ4ZWQ4N2M3YzgxYzgwZjE0ZDRkMWUiCiAgICB9CiAgfQp9"),
    KASSADIN(QuestArea.VOID, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTZjMGIzNmQ1M2ZmZjY5YTQ5YzdkNmYzOTMyZjJiMGZlOTQ4ZTAzMjIyNmQ1ZTgwNDVlYzU4NDA4YTM2ZTk1MSJ9fX0="),
    KOGMAW(QuestArea.VOID, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTUxY2YwNzVhMWY1MzMxNWQ3NjE4MjFjZWY3MmEyNWY2YzE1ZGQ5OGE3YTM4NzJmYzliZWM1OTdhYmMzYjEifX19"),
    ;

    private QuestArea area;
    private final String head;


    QuestGiver(QuestArea area, String head) {
        this.area = area;
        this.head = head;
    }

    public QuestArea getArea() {
        return area;
    }

    public String getHead() {
        return head;
    }

}
