const express = require("express");
const router = express.Router();
const auth = require("../middleware/auth");
const { check, validationResult } = require("express-validator");

const Profile = require("../models/Profile");
const User = require("../models/User");

router.get("/me", auth, async (req, res) => {
  try {
    const profile = await Profile.findOne({
      user: req.user.id,
    }).populate("user", ["firstName", "lastName", "email"]);

    if (!profile) {
      return res.status(400).json({ msg: "There is no profile for this user" });
    }

    res.json(profile);
  } catch (error) {
    console.error(error.message);
    res.status(500).send("Server Error");
  }
});

router.post("/", [auth], async (req, res) => {
  const { birthday, address } = req.body;

  const profileField = {};
  profileField.user = req.user.id;
  if (birthday) profileField.birthday = birthday;
  if (address) profileField.address = address;

  try {
    let profile = await Profile.findOne({ user: req.user.id });

    if (profile) {
      // update
      profile = await Profile.findOneAndUpdate(
        { user: req.user.id },
        { $set: profileField },
        { new: true }
      );
      return res.json(profile);
    } else {
      // create
      profile = new Profile(profileField);
      await profile.save();
      return res.json(profile);
    }
  } catch (err) {
    console.error(err.message);
    res.status(500).send("Server Error");
  }

  res.send("Hello");
});

router.get("/", async (req, res) => {
  try {
    const profiles = await Profile.find();
  } catch (err) {
    console.error(err.message);
    res.status(500).send("Server Error");
  }
});

module.exports = router;
