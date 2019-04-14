/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.example;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-04-13")
public class Tweet implements org.apache.thrift.TBase<Tweet, Tweet._Fields>, java.io.Serializable, Cloneable, Comparable<Tweet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Tweet");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOC_FIELD_DESC = new org.apache.thrift.protocol.TField("loc", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField TWEET_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("tweetType", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField LANGUAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("language", org.apache.thrift.protocol.TType.STRING, (short)16);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TweetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TweetTupleSchemeFactory();

  public int userId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String userName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String text; // required
  public @org.apache.thrift.annotation.Nullable Location loc; // optional
  /**
   * 
   * @see TweetType
   */
  public @org.apache.thrift.annotation.Nullable TweetType tweetType; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String language; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    USER_NAME((short)2, "userName"),
    TEXT((short)3, "text"),
    LOC((short)4, "loc"),
    /**
     * 
     * @see TweetType
     */
    TWEET_TYPE((short)5, "tweetType"),
    LANGUAGE((short)16, "language");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_ID
          return USER_ID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // TEXT
          return TEXT;
        case 4: // LOC
          return LOC;
        case 5: // TWEET_TYPE
          return TWEET_TYPE;
        case 16: // LANGUAGE
          return LANGUAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LOC,_Fields.TWEET_TYPE,_Fields.LANGUAGE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOC, new org.apache.thrift.meta_data.FieldMetaData("loc", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Location.class)));
    tmpMap.put(_Fields.TWEET_TYPE, new org.apache.thrift.meta_data.FieldMetaData("tweetType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TweetType.class)));
    tmpMap.put(_Fields.LANGUAGE, new org.apache.thrift.meta_data.FieldMetaData("language", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Tweet.class, metaDataMap);
  }

  public Tweet() {
    this.tweetType = thrift.example.TweetType.TWEET;

    this.language = "english";

  }

  public Tweet(
    int userId,
    java.lang.String userName,
    java.lang.String text)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.userName = userName;
    this.text = text;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Tweet(Tweet other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userId = other.userId;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetText()) {
      this.text = other.text;
    }
    if (other.isSetLoc()) {
      this.loc = new Location(other.loc);
    }
    if (other.isSetTweetType()) {
      this.tweetType = other.tweetType;
    }
    if (other.isSetLanguage()) {
      this.language = other.language;
    }
  }

  public Tweet deepCopy() {
    return new Tweet(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.userName = null;
    this.text = null;
    this.loc = null;
    this.tweetType = thrift.example.TweetType.TWEET;

    this.language = "english";

  }

  public int getUserId() {
    return this.userId;
  }

  public Tweet setUserId(int userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUserName() {
    return this.userName;
  }

  public Tweet setUserName(@org.apache.thrift.annotation.Nullable java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getText() {
    return this.text;
  }

  public Tweet setText(@org.apache.thrift.annotation.Nullable java.lang.String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Location getLoc() {
    return this.loc;
  }

  public Tweet setLoc(@org.apache.thrift.annotation.Nullable Location loc) {
    this.loc = loc;
    return this;
  }

  public void unsetLoc() {
    this.loc = null;
  }

  /** Returns true if field loc is set (has been assigned a value) and false otherwise */
  public boolean isSetLoc() {
    return this.loc != null;
  }

  public void setLocIsSet(boolean value) {
    if (!value) {
      this.loc = null;
    }
  }

  /**
   * 
   * @see TweetType
   */
  @org.apache.thrift.annotation.Nullable
  public TweetType getTweetType() {
    return this.tweetType;
  }

  /**
   * 
   * @see TweetType
   */
  public Tweet setTweetType(@org.apache.thrift.annotation.Nullable TweetType tweetType) {
    this.tweetType = tweetType;
    return this;
  }

  public void unsetTweetType() {
    this.tweetType = null;
  }

  /** Returns true if field tweetType is set (has been assigned a value) and false otherwise */
  public boolean isSetTweetType() {
    return this.tweetType != null;
  }

  public void setTweetTypeIsSet(boolean value) {
    if (!value) {
      this.tweetType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLanguage() {
    return this.language;
  }

  public Tweet setLanguage(@org.apache.thrift.annotation.Nullable java.lang.String language) {
    this.language = language;
    return this;
  }

  public void unsetLanguage() {
    this.language = null;
  }

  /** Returns true if field language is set (has been assigned a value) and false otherwise */
  public boolean isSetLanguage() {
    return this.language != null;
  }

  public void setLanguageIsSet(boolean value) {
    if (!value) {
      this.language = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.Integer)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((java.lang.String)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((java.lang.String)value);
      }
      break;

    case LOC:
      if (value == null) {
        unsetLoc();
      } else {
        setLoc((Location)value);
      }
      break;

    case TWEET_TYPE:
      if (value == null) {
        unsetTweetType();
      } else {
        setTweetType((TweetType)value);
      }
      break;

    case LANGUAGE:
      if (value == null) {
        unsetLanguage();
      } else {
        setLanguage((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case USER_NAME:
      return getUserName();

    case TEXT:
      return getText();

    case LOC:
      return getLoc();

    case TWEET_TYPE:
      return getTweetType();

    case LANGUAGE:
      return getLanguage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case USER_NAME:
      return isSetUserName();
    case TEXT:
      return isSetText();
    case LOC:
      return isSetLoc();
    case TWEET_TYPE:
      return isSetTweetType();
    case LANGUAGE:
      return isSetLanguage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Tweet)
      return this.equals((Tweet)that);
    return false;
  }

  public boolean equals(Tweet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    boolean this_present_loc = true && this.isSetLoc();
    boolean that_present_loc = true && that.isSetLoc();
    if (this_present_loc || that_present_loc) {
      if (!(this_present_loc && that_present_loc))
        return false;
      if (!this.loc.equals(that.loc))
        return false;
    }

    boolean this_present_tweetType = true && this.isSetTweetType();
    boolean that_present_tweetType = true && that.isSetTweetType();
    if (this_present_tweetType || that_present_tweetType) {
      if (!(this_present_tweetType && that_present_tweetType))
        return false;
      if (!this.tweetType.equals(that.tweetType))
        return false;
    }

    boolean this_present_language = true && this.isSetLanguage();
    boolean that_present_language = true && that.isSetLanguage();
    if (this_present_language || that_present_language) {
      if (!(this_present_language && that_present_language))
        return false;
      if (!this.language.equals(that.language))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + userId;

    hashCode = hashCode * 8191 + ((isSetUserName()) ? 131071 : 524287);
    if (isSetUserName())
      hashCode = hashCode * 8191 + userName.hashCode();

    hashCode = hashCode * 8191 + ((isSetText()) ? 131071 : 524287);
    if (isSetText())
      hashCode = hashCode * 8191 + text.hashCode();

    hashCode = hashCode * 8191 + ((isSetLoc()) ? 131071 : 524287);
    if (isSetLoc())
      hashCode = hashCode * 8191 + loc.hashCode();

    hashCode = hashCode * 8191 + ((isSetTweetType()) ? 131071 : 524287);
    if (isSetTweetType())
      hashCode = hashCode * 8191 + tweetType.getValue();

    hashCode = hashCode * 8191 + ((isSetLanguage()) ? 131071 : 524287);
    if (isSetLanguage())
      hashCode = hashCode * 8191 + language.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Tweet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetText()).compareTo(other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLoc()).compareTo(other.isSetLoc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loc, other.loc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTweetType()).compareTo(other.isSetTweetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTweetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tweetType, other.tweetType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLanguage()).compareTo(other.isSetLanguage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLanguage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.language, other.language);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Tweet(");
    boolean first = true;

    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("text:");
    if (this.text == null) {
      sb.append("null");
    } else {
      sb.append(this.text);
    }
    first = false;
    if (isSetLoc()) {
      if (!first) sb.append(", ");
      sb.append("loc:");
      if (this.loc == null) {
        sb.append("null");
      } else {
        sb.append(this.loc);
      }
      first = false;
    }
    if (isSetTweetType()) {
      if (!first) sb.append(", ");
      sb.append("tweetType:");
      if (this.tweetType == null) {
        sb.append("null");
      } else {
        sb.append(this.tweetType);
      }
      first = false;
    }
    if (isSetLanguage()) {
      if (!first) sb.append(", ");
      sb.append("language:");
      if (this.language == null) {
        sb.append("null");
      } else {
        sb.append(this.language);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    if (userName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userName' was not present! Struct: " + toString());
    }
    if (text == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'text' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (loc != null) {
      loc.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TweetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TweetStandardScheme getScheme() {
      return new TweetStandardScheme();
    }
  }

  private static class TweetStandardScheme extends org.apache.thrift.scheme.StandardScheme<Tweet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Tweet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userId = iprot.readI32();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.loc = new Location();
              struct.loc.read(iprot);
              struct.setLocIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TWEET_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tweetType = thrift.example.TweetType.findByValue(iprot.readI32());
              struct.setTweetTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 16: // LANGUAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.language = iprot.readString();
              struct.setLanguageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetUserId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Tweet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.userId);
      oprot.writeFieldEnd();
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      if (struct.text != null) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeString(struct.text);
        oprot.writeFieldEnd();
      }
      if (struct.loc != null) {
        if (struct.isSetLoc()) {
          oprot.writeFieldBegin(LOC_FIELD_DESC);
          struct.loc.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tweetType != null) {
        if (struct.isSetTweetType()) {
          oprot.writeFieldBegin(TWEET_TYPE_FIELD_DESC);
          oprot.writeI32(struct.tweetType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.language != null) {
        if (struct.isSetLanguage()) {
          oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
          oprot.writeString(struct.language);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TweetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TweetTupleScheme getScheme() {
      return new TweetTupleScheme();
    }
  }

  private static class TweetTupleScheme extends org.apache.thrift.scheme.TupleScheme<Tweet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Tweet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.userId);
      oprot.writeString(struct.userName);
      oprot.writeString(struct.text);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLoc()) {
        optionals.set(0);
      }
      if (struct.isSetTweetType()) {
        optionals.set(1);
      }
      if (struct.isSetLanguage()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetLoc()) {
        struct.loc.write(oprot);
      }
      if (struct.isSetTweetType()) {
        oprot.writeI32(struct.tweetType.getValue());
      }
      if (struct.isSetLanguage()) {
        oprot.writeString(struct.language);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Tweet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.userId = iprot.readI32();
      struct.setUserIdIsSet(true);
      struct.userName = iprot.readString();
      struct.setUserNameIsSet(true);
      struct.text = iprot.readString();
      struct.setTextIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.loc = new Location();
        struct.loc.read(iprot);
        struct.setLocIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tweetType = thrift.example.TweetType.findByValue(iprot.readI32());
        struct.setTweetTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.language = iprot.readString();
        struct.setLanguageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

