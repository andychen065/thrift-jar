/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.javabloger.gen.code;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-04-14")
public class Blog implements org.apache.thrift.TBase<Blog, Blog._Fields>, java.io.Serializable, Cloneable, Comparable<Blog> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Blog");

  private static final org.apache.thrift.protocol.TField TOPIC_FIELD_DESC = new org.apache.thrift.protocol.TField("topic", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField IP_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("ipAddress", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PROPS_FIELD_DESC = new org.apache.thrift.protocol.TField("props", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BlogStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BlogTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String topic; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer content; // required
  public long createdTime; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String ipAddress; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> props; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPIC((short)1, "topic"),
    CONTENT((short)2, "content"),
    CREATED_TIME((short)3, "createdTime"),
    ID((short)4, "id"),
    IP_ADDRESS((short)5, "ipAddress"),
    PROPS((short)6, "props");

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
        case 1: // TOPIC
          return TOPIC;
        case 2: // CONTENT
          return CONTENT;
        case 3: // CREATED_TIME
          return CREATED_TIME;
        case 4: // ID
          return ID;
        case 5: // IP_ADDRESS
          return IP_ADDRESS;
        case 6: // PROPS
          return PROPS;
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
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC, new org.apache.thrift.meta_data.FieldMetaData("topic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IP_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("ipAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROPS, new org.apache.thrift.meta_data.FieldMetaData("props", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Blog.class, metaDataMap);
  }

  public Blog() {
  }

  public Blog(
    java.lang.String topic,
    java.nio.ByteBuffer content,
    long createdTime,
    java.lang.String id,
    java.lang.String ipAddress,
    java.util.Map<java.lang.String,java.lang.String> props)
  {
    this();
    this.topic = topic;
    this.content = org.apache.thrift.TBaseHelper.copyBinary(content);
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.id = id;
    this.ipAddress = ipAddress;
    this.props = props;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Blog(Blog other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopic()) {
      this.topic = other.topic;
    }
    if (other.isSetContent()) {
      this.content = org.apache.thrift.TBaseHelper.copyBinary(other.content);
    }
    this.createdTime = other.createdTime;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetIpAddress()) {
      this.ipAddress = other.ipAddress;
    }
    if (other.isSetProps()) {
      java.util.Map<java.lang.String,java.lang.String> __this__props = new java.util.HashMap<java.lang.String,java.lang.String>(other.props);
      this.props = __this__props;
    }
  }

  public Blog deepCopy() {
    return new Blog(this);
  }

  @Override
  public void clear() {
    this.topic = null;
    this.content = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.id = null;
    this.ipAddress = null;
    this.props = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTopic() {
    return this.topic;
  }

  public Blog setTopic(@org.apache.thrift.annotation.Nullable java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  public void unsetTopic() {
    this.topic = null;
  }

  /** Returns true if field topic is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic() {
    return this.topic != null;
  }

  public void setTopicIsSet(boolean value) {
    if (!value) {
      this.topic = null;
    }
  }

  public byte[] getContent() {
    setContent(org.apache.thrift.TBaseHelper.rightSize(content));
    return content == null ? null : content.array();
  }

  public java.nio.ByteBuffer bufferForContent() {
    return org.apache.thrift.TBaseHelper.copyBinary(content);
  }

  public Blog setContent(byte[] content) {
    this.content = content == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(content.clone());
    return this;
  }

  public Blog setContent(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer content) {
    this.content = org.apache.thrift.TBaseHelper.copyBinary(content);
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public Blog setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getId() {
    return this.id;
  }

  public Blog setId(@org.apache.thrift.annotation.Nullable java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIpAddress() {
    return this.ipAddress;
  }

  public Blog setIpAddress(@org.apache.thrift.annotation.Nullable java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public void unsetIpAddress() {
    this.ipAddress = null;
  }

  /** Returns true if field ipAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetIpAddress() {
    return this.ipAddress != null;
  }

  public void setIpAddressIsSet(boolean value) {
    if (!value) {
      this.ipAddress = null;
    }
  }

  public int getPropsSize() {
    return (this.props == null) ? 0 : this.props.size();
  }

  public void putToProps(java.lang.String key, java.lang.String val) {
    if (this.props == null) {
      this.props = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.props.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getProps() {
    return this.props;
  }

  public Blog setProps(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> props) {
    this.props = props;
    return this;
  }

  public void unsetProps() {
    this.props = null;
  }

  /** Returns true if field props is set (has been assigned a value) and false otherwise */
  public boolean isSetProps() {
    return this.props != null;
  }

  public void setPropsIsSet(boolean value) {
    if (!value) {
      this.props = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TOPIC:
      if (value == null) {
        unsetTopic();
      } else {
        setTopic((java.lang.String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        if (value instanceof byte[]) {
          setContent((byte[])value);
        } else {
          setContent((java.nio.ByteBuffer)value);
        }
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((java.lang.Long)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case IP_ADDRESS:
      if (value == null) {
        unsetIpAddress();
      } else {
        setIpAddress((java.lang.String)value);
      }
      break;

    case PROPS:
      if (value == null) {
        unsetProps();
      } else {
        setProps((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC:
      return getTopic();

    case CONTENT:
      return getContent();

    case CREATED_TIME:
      return getCreatedTime();

    case ID:
      return getId();

    case IP_ADDRESS:
      return getIpAddress();

    case PROPS:
      return getProps();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOPIC:
      return isSetTopic();
    case CONTENT:
      return isSetContent();
    case CREATED_TIME:
      return isSetCreatedTime();
    case ID:
      return isSetId();
    case IP_ADDRESS:
      return isSetIpAddress();
    case PROPS:
      return isSetProps();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Blog)
      return this.equals((Blog)that);
    return false;
  }

  public boolean equals(Blog that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_topic = true && this.isSetTopic();
    boolean that_present_topic = true && that.isSetTopic();
    if (this_present_topic || that_present_topic) {
      if (!(this_present_topic && that_present_topic))
        return false;
      if (!this.topic.equals(that.topic))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_ipAddress = true && this.isSetIpAddress();
    boolean that_present_ipAddress = true && that.isSetIpAddress();
    if (this_present_ipAddress || that_present_ipAddress) {
      if (!(this_present_ipAddress && that_present_ipAddress))
        return false;
      if (!this.ipAddress.equals(that.ipAddress))
        return false;
    }

    boolean this_present_props = true && this.isSetProps();
    boolean that_present_props = true && that.isSetProps();
    if (this_present_props || that_present_props) {
      if (!(this_present_props && that_present_props))
        return false;
      if (!this.props.equals(that.props))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTopic()) ? 131071 : 524287);
    if (isSetTopic())
      hashCode = hashCode * 8191 + topic.hashCode();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(createdTime);

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetIpAddress()) ? 131071 : 524287);
    if (isSetIpAddress())
      hashCode = hashCode * 8191 + ipAddress.hashCode();

    hashCode = hashCode * 8191 + ((isSetProps()) ? 131071 : 524287);
    if (isSetProps())
      hashCode = hashCode * 8191 + props.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Blog other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTopic()).compareTo(other.isSetTopic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topic, other.topic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIpAddress()).compareTo(other.isSetIpAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIpAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ipAddress, other.ipAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProps()).compareTo(other.isSetProps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.props, other.props);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Blog(");
    boolean first = true;

    sb.append("topic:");
    if (this.topic == null) {
      sb.append("null");
    } else {
      sb.append(this.topic);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.content, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ipAddress:");
    if (this.ipAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.ipAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("props:");
    if (this.props == null) {
      sb.append("null");
    } else {
      sb.append(this.props);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class BlogStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BlogStandardScheme getScheme() {
      return new BlogStandardScheme();
    }
  }

  private static class BlogStandardScheme extends org.apache.thrift.scheme.StandardScheme<Blog> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Blog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topic = iprot.readString();
              struct.setTopicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readBinary();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IP_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ipAddress = iprot.readString();
              struct.setIpAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROPS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.props = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key1;
                @org.apache.thrift.annotation.Nullable java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.props.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setPropsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Blog struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topic != null) {
        oprot.writeFieldBegin(TOPIC_FIELD_DESC);
        oprot.writeString(struct.topic);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeBinary(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.ipAddress != null) {
        oprot.writeFieldBegin(IP_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.ipAddress);
        oprot.writeFieldEnd();
      }
      if (struct.props != null) {
        oprot.writeFieldBegin(PROPS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.props.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter4 : struct.props.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BlogTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BlogTupleScheme getScheme() {
      return new BlogTupleScheme();
    }
  }

  private static class BlogTupleScheme extends org.apache.thrift.scheme.TupleScheme<Blog> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Blog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTopic()) {
        optionals.set(0);
      }
      if (struct.isSetContent()) {
        optionals.set(1);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(2);
      }
      if (struct.isSetId()) {
        optionals.set(3);
      }
      if (struct.isSetIpAddress()) {
        optionals.set(4);
      }
      if (struct.isSetProps()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTopic()) {
        oprot.writeString(struct.topic);
      }
      if (struct.isSetContent()) {
        oprot.writeBinary(struct.content);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetIpAddress()) {
        oprot.writeString(struct.ipAddress);
      }
      if (struct.isSetProps()) {
        {
          oprot.writeI32(struct.props.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter5 : struct.props.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Blog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.topic = iprot.readString();
        struct.setTopicIsSet(true);
      }
      if (incoming.get(1)) {
        struct.content = iprot.readBinary();
        struct.setContentIsSet(true);
      }
      if (incoming.get(2)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.ipAddress = iprot.readString();
        struct.setIpAddressIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.props = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map6.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key7;
          @org.apache.thrift.annotation.Nullable java.lang.String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.props.put(_key7, _val8);
          }
        }
        struct.setPropsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
