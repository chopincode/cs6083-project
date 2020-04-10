const express = require("express");
const app = express();
const connectDB = require("./config/db");

connectDB();

app.use(express.json({ extended: false }));

const PORT = process.env.PORT || 5000;

app.use("/api/user", require("./routes/user"));
app.use("/api/auth", require("./routes/auth"));
app.use("/api/profile", require("./routes/profile"));

app.listen(PORT, () => console.log(`Server started on port ${PORT}`));
